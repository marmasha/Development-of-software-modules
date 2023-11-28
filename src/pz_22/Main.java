package pz_22;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;
public class Main extends Canvas {
    static int width = 750, height = 750; //размеры окна
    public static void main(String[] args) throws IOException {
        //ДЛЯ ПОЯВЛЕНИЯ ОКОШКА С НУЖНЫМИ НАМ ПАРАМЕТРАМИ РАЗМЕРА
        JFrame frame = new JFrame();
        frame.setVisible(true); //окошко
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //для его закрытия
        frame.setTitle("логотип DVD");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height + 30);
        frame.getContentPane().setLayout(null);
        //выравнивание, чтобы координаты объектов в дальнейшем считались от верхнего левого угла
        frame.getContentPane().setBackground(Color.BLACK); //фон окна

        //ДОБАВЛЕНИЕ КАРТИНКИ И УСТАНОВКА ПОЯВЛЕНИЯ
        BufferedImage screamHead = ImageIO.read(new URL("https://www.dvdland.com.au/product_images/p/196/dvd_7__69128_std.jpg"));
        //скачиваем картинку
        int screamHeadWidth = screamHead.getWidth();
        //запоминаем ее размер(понадобится, когда будем двигать JLabel)
        int screamHeadHeight = screamHead.getHeight();
        //запоминаем ее размер(понадобится, когда будем двигать JLabel)
        JLabel wIcon = new JLabel(new ImageIcon(screamHead));
        //создаем объект с картинкой, который будем размещать и двигать
        int startX = (int) (Math.random() * (width - screamHeadWidth)),
                startY = (int) (Math.random() * (height - screamHeadHeight)); //рандомно задаем новые координаты
        wIcon.setBounds(startX, startY, screamHeadWidth, screamHeadHeight); //устанавливаем начальное положение картинки
        frame.add(wIcon); //добавляем картинку на форму

        //ДЕЛАЕМ БЕСКОНЕЧНЫЙ ЦИКЛ ПЕРЕМЕЩЕНИЯ КАРТИНКИ
        while(true){
            int newX = (int) (Math.random() * (width - screamHeadWidth)),
                    newY = (int) (Math.random() * (height - screamHeadHeight)); //задаем новую точку
            int[][] path = drawBresenhamLine(startX, startY, newX, newY);
            //по алгоритму Брезенхэма получаем путь (список координат к новой точке)
            startX = newX; //обновляем точки
            startY = newY;
            for (int i = 5; i < path.length; i += 5) {//идем по массиву точек с нужным шагом
                try {//сперва работает таймер
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                wIcon.setBounds(path[i][0], path[i][1], screamHeadWidth, screamHeadHeight);
                //перемещаем картинку в нужную точку
                wIcon.repaint();//перерисовываем картинку
            }
        }
    }

    public static int[][] drawBresenhamLine(int xstart, int ystart,int xend, int yend)//реализация
    // подсчета коордианат линии между двумя точками в пространстве
    // по алгоритму Брезенхэма
    // взято с https://ru.wikibooks.org/wiki/Реализация_алгоритмов/Алгоритм_Брезенхэма#Реализация_на_Java
    /**
     * xstart, ystart - начало;
     * wend,yend - конец;
     * *g.drawLine (x, y, 1, 1);" используем в качестве "setPyxel (x, y);"
     * Можно писать что-нибудь вроде g.fillRect (x, y, 1, 1);
     */
    {
        int x, y, dx, dy, incx, incy, pdx, pdy, es, el, err;

        dx = xend - xstart;// проекция на ось икс
        dy = yend - ystart;// проекция на ось игрек

        incx = sign(dx);
        /*
        Определяем, в какую сторону можно будет сдвигаться. Если dx < 0, т. е. отрезок идет
        справа налево по иксу, то incx будет равен -1.
        Это будет использоваться в цикле повторения.
         */
        incy = sign(dy);
         /*
        Аналогично. Если рисуем отрезок снизу вверх -
        это будет отрицательный сдвиг для у (иначе - положительный).
         */
        if (dx < 0) dx = -dx; //далее не будем сравнивать
        if (dy < 0) dy = -dy; //поэтому необходимо сделать dx = |dx|; dy = |dy|
        // эти две строчки можно записать и так: dx = Math.abs(dx); dy = Math.abs(dy);

        if (dx > dy)
        // определяем наклон отрезка:
        {
            /*
            Если dx > dy, то отрезок *вытянут* вдоль оси икс, т.е. он скорее длинный, чем высокий.
            Значит в цикле нужно будет идти по икс (строчка el = dx;), значит *протягивать* прямую по иксу
            надо в соответствии с тем, слева направо и справа налево она идёт (pdx =incx;), при этом
            по у сдвиг такой отсутсвует.
             */
            pdx = incx;
            pdy = 0;
            es = dy;
            el = dx;
        } else //случай, когда прямая скорее высокая, чем длинная, т.е. вытянута по оси у
        {
            pdx = 0;
            pdy = incy;
            es = dx;
            el = dy;//тогда в цикле будем двигаться по у
        }
        x = xstart;
        y = ystart;
        err = el / 2;
        int[][] a = new int[el + 1][2]; // создаем массив для хранения точек
        a[0][0] = x; //заносим первую точку
        a[0][1] = y;
        //все последующие точки возможно надо сдвигать, поэтому первую ставим ве цикла

        for (int t = 0; t <el; t++) // идём по всем точкам, начиная со второй и до последней
        {
            err -= es;
            if(err < 0){
                err += el;
                x += incx; //сдвинуть прямую (сместить вверх или вниз, если цикл проходит по иксам)
                y += incy; //или сместить влево-вправо, если цикл проходит по у
            }
            a[t + 1][0] = x; //добавляем точку в массив
            a[t + 1][1] = y;
        }
        return a;
    }

    // Метод для drawBresenhamLine - этот код рисует все 9 видов отрезков. Наклонные (из начала в конец и из конца в
    // начало каждый), вертикальный и горизонтальный - тоже из начала в конец и из конца в начало, и точку.
    private static int sign(int x) {
        return (x > 0) ? 1 : (x < 0) ? -1 : 0;
        //возращает 0, если аргумент(х) равен нулю; -1, если х < 0 и 1, если х > 0.
    }
}
