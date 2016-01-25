# garbage-collection

**1) Serial Collector** (-PserialGC) -XX:-UseSerialGC

6m initial heap size for when the JVM starts -Xms6m  
18m maximum heap size -Xmx18m  
2m size of the Young Generation -XX:NewSize=2m -XX:MaxNewSize=2m  
20m starting size of the Permanent Generation -XX:PermSize=20m  
30 maximum size of the Permanent Generation -XX:MaxPermSize=30m  

![Serial GC Heap](/../screenshots/serialGCHeap.png?raw=true "Serial GC Heap")
![Serial GC PermGen](/../screenshots/serialGCPermGen.png?raw=true "Serial GC PermGen")

**2) Parallel Collector** (-PparallelGC) -XX:-UseParallelGC

3m initial heap size for when the JVM starts -Xms3m  
12m maximum heap size -Xmx12m  
1m size of the Young Generation -XX:NewSize=1m -XX:MaxNewSize=1m  
20m starting size of the Permanent Generation -XX:PermSize=20m  
20m maximum size of the Permanent Generation -XX:MaxPermSize=20m

![Parallel GC Heap](/../screenshots/parallelGCHeap.png?raw=true "Parallel GC Heap")
![Parallel GC PermGen](/../screenshots/parallelGCPermGen.png?raw=true "Parallel GC PermGen")

**3) Parallel Old Collector** (-PparallelOldGC) -XX:-UseParallelOldGC

9m initial heap size for when the JVM starts -Xms9m  
18m maximum heap size -Xmx18m  
3m size of the Young Generation -XX:NewSize=3m -XX:MaxNewSize=3m  
40m starting size of the Permanent Generation -XX:PermSize=40m  
40m maximum size of the Permanent Generation -XX:MaxPermSize=40m  

![Parallel Old GC Heap](/../screenshots/parallelOldGCHeap.png?raw=true "Parallel Old GC Heap")
![Parallel Old GC PermGen](/../screenshots/parallelOldGCPermGen.png?raw=true "Parallel Old GC PermGen")

**4) Concurrent Mark Sweep (CMS) Collector with 2 Parallel CMS Threads** (-PconcMarkSweepGC) -XX:-UseConcMarkSweepGC -XX:ParallelGCThreads=2

6m initial heap size for when the JVM starts -Xms6m  
18m maximum heap size -Xmx18m  
2m size of the Young Generation -XX:NewSize=2m -XX:NewSize=2m  
20m starting size of the Permanent Generation -XX:PermSize=20m  
30m maximum size of the Permanent Generatio -XX:MaxPermSize=30m  

![ConcMarkSweep GC Heap](/../screenshots/concMarkSweepGCHeap.png?raw=true "ConcMarkSweep GC Heap")
![ConcMarkSweep GC PermGen](/../screenshots/concMarkSweepGCPermGen.png?raw=true "ConcMarkSweep GC PermGen")

**5) G1 Garbage Collector** (-Pg1GC) -XX:+UseG1GC

4m initial heap size for when the JVM starts -Xms4m  
16m maximum heap size -Xmx16m  
2m size of the Young Generation -XX:NewSize=2m -XX:MaxNewSize=2m  
12m starting size of the Permanent Generation -XX:PermSize=12m  
18m maximum size of the Permanent Generation -XX:MaxPermSize=18m  

![G1 GC Heap](/../screenshots/g1GCHeap.png?raw=true "G1 GC Heap")
![G1 GC PermGen](/../screenshots/g1GCPermGen.png?raw=true "G1 GC PermGen")
