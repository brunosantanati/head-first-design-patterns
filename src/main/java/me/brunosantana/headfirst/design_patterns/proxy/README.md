# Gumball Machine with Proxy Pattern

To get code running on localhost: 

1. Change directories to the same level with headfirst/ folder in bin/

2. Run rmiregistry in background:
rmiregistry &

3. Run:
java headfirst/designpatterns/proxy/gumball/GumballMachineTestDrive localhost 300

4. In a different window, run:
java headfirst/designpatterns/proxy/gumball/GumballMonitorTestDrive localhost

In my notebook(Maven project):

bruno@bruno-notebook:~/eclipse-2019‑06-workspace/design-patterns/target/classes$ rmiregistry

bruno@bruno-notebook:~/eclipse-2019‑06-workspace/design-patterns/target/classes$ java me/brunosantana/headfirst/design_patterns/proxy/GumballMachineTestDrive localhost 300

bruno@bruno-notebook:~/eclipse-2019‑06-workspace/design-patterns/target/classes$ java me/brunosantana/headfirst/design_patterns/proxy/GumballMonitorTestDrive localhost