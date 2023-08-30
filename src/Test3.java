public class Test3 {

    public static void main(String[] args) {
        int num;

        num = 1255520211;

    }

    public static void transform(int numToTransform) {
        String numToString = String.valueOf(numToTransform); // парсим число в строку

        int index = numToString.lastIndexOf('0'); //находим индекс самого правого 0

        if (index > 0) {
            StringBuilder sb = new StringBuilder(numToString);

            sb.setCharAt(index, '1'); // меняем самый правый 0 на 1

            System.out.println(Integer.parseInt(sb.toString())); //выводим на экран запарсеное обратно из строки число
        }
    }
}
