public class Ganeshbellale
{
public static void main(String args[])
{
Exam exam=new Exam();
exam.setExamId(Integer.parseInt(args[0]));
exam.setExamType(args[1]);
exam.setExamFee(Double.parseDouble(args[2]));
System.out.println("ExamId="+exam.getExamId());
System.out.println("ExamType="+exam.getExamType());
System.out.println("ExamFee="+exam.getExamFee());
}
}