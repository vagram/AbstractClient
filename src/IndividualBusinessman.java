public class IndividualBusinessman extends Client{
    public static double commision;
    public IndividualBusinessman() {
    }

    @Override
    public void put(double deposit) {
        if (deposit <= 1000) {
            commision = deposit * 0.01;
            super.put(deposit + commision);
        }else if (deposit > 1000){
            commision = deposit * 0.005;
            super.put(deposit + commision);
        }
    }
}
