package dev.lombok;

public class Test {

    public static void main(String[] args) {
        DevVO devVO = new DevVO();
        
        devVO.setName("�մ���");
        devVO.setYear(3.5);
        devVO.setPayTot(3000000);
        devVO.setPay_tax(5.3);
        
        System.out.println("����: " + devVO.getName());
        System.out.println("���: " + devVO.getYear());
        System.out.println("�޿�: " + devVO.getPayTot());
        System.out.println("����(%): " + devVO.getPay_tax() + " %");

        System.out.println(devVO.toString());
    }

}
