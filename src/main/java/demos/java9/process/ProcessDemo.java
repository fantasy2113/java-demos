package demos.java9.process;

import java.io.IOException;

/**
 * Created by booth02-mgr2 on 16.07.2017.
 */
public class ProcessDemo {

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println(currentProcess.info().command());

        ProcessBuilder builder = new ProcessBuilder().command("cmd");
        try {
            Process p = builder.start();
            ProcessHandle processHandle = p.toHandle();
            processHandle.onExit().whenComplete((h, t) -> System.out.println("Process exited"));
            processHandle.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ProcessHandle
                .allProcesses()
                .filter(p -> p.info().command().map(cmd -> cmd.contains("notepad")).orElse(false))
                .findFirst()
                .ifPresent(ProcessHandle::destroy);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
