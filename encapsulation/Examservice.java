public class Examservice
{
public static void main(String x[])
{
Exam exam=new Exam();
exam.setExamid(Integer.parseInt(x[0]));
exam.setExamtype(x[1]);
exam.setExamid(Double.parseDouble(x[0]));
System.out.println("Exam Id="+exam.getExamId());
System.out.println("Exam Type="+exam.getExamType());
System.out.println("Exam Fee="+exam.getExamFee());
}
}