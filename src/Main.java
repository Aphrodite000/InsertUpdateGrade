import java.util.*;
public class Main{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] a = s.split(" ");
                int n = Integer.parseInt(a[0]);
                int operate = Integer.parseInt(a[1]);
                String s1 = sc.nextLine();
                String[] b = s1.split(" ");
                int[] c = new int[n];
                for (int i = 0; i < n; i++) {
                    c[i] = Integer.parseInt(b[i]);
                }
                String[] str = new String[operate];
                for (int i = 0; i < operate; i++) {
                    str[i] = sc.nextLine();
                    int max = 0;
                    String[] line = str[i].split(" ");
                    //System.out.println(Arrays.toString(line));
                    if (line[0].equals("Q")) {
                        //字符串比较用equals方法
                        if(Integer.parseInt(line[1]) - 1<Integer.parseInt(line[2]) - 1){
                        int[] r = Arrays.copyOfRange(c, Integer.parseInt(line[1]) - 1, Integer.parseInt(line[2]));
                        //切割数组左闭右开，所以后面没有-1
                        //ID号12345对应ID的下标为01234
                        Arrays.sort(r);
                        System.out.println(r[r.length - 1]);
                        }else {
                            int[] r = Arrays.copyOfRange(c, Integer.parseInt(line[2]) - 1, Integer.parseInt(line[1]));
                            //切割数组左闭右开，所以后面没有-1
                            //ID号12345对应ID的下标为01234
                            Arrays.sort(r);
                            System.out.println(r[r.length - 1]);
                        }
                    }
                    if (line[0].equals("U")) {
                        c[Integer.parseInt(line[1]) - 1] = Integer.parseInt(line[2]);
                        // System.out.println(Integer.parseInt(line[2]));
                    }
                }
            }
        }
}
