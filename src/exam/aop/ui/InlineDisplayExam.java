package exam.aop.ui;

import exam.aop.entity.Exam;

public class InlineDisplayExam implements DisplayExam {

	private Exam exam;
	
	@Override
	public void display() {
		System.out.printf("Totoal : %d   Average : %f ~~~~~~\n", exam.total(), exam.avg());
	}
	
	@Override
	public void setExam(Exam exam)
	{
		this.exam = exam;
	}

}