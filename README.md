```
$ boot build
Compiling 1 Java source files...
Adding uberjar entries...
Writing project.jar...
$ time java -jar target/project.jar clojure
Hello from Clojure!

real	0m0.777s
user	0m1.492s
sys	0m0.036s
$ time java -jar target/project.jar java
Hello from Java!

real	0m0.056s
user	0m0.040s
sys	0m0.020s
```
