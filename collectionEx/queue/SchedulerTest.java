package collectionEx.queue;

public class SchedulerTest {

	public static void main(String[] args) {
		//���� �۾��� ����
		TaskScheduler scheduler = new TaskScheduler();
		scheduler.addTask(new CompressionTask());
		scheduler.addTask(new BackupTask());
		scheduler.addTask(new CleanTask());
		
		//���� �ð��� ����
		System.out.println("�۾� ����");
		run(scheduler);
		System.out.println("�۾� ����");

	}
	
	private static void run(TaskScheduler scheduler) {
		while (scheduler.getRemainingTasks() > 0) {
			scheduler.processNextTask();
		}
	}

}
