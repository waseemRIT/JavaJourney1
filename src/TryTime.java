public class TryTime {
    public static void main(String[] args){
        Time time1 = new Time(2, 4, 1);
        System.out.println(time1.getTime());

        time1.setSeconds(66);
        System.out.println(time1.getTime());

        System.out.println(time1.getHours());
        System.out.println(time1.getMinutes());

        time1.setSeconds(2);
        System.out.println(time1.getTime());
    }
}
