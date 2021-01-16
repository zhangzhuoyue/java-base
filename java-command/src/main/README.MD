##java 命令行工具
1. 查看版本：java -version
2. 编译：javac -encoding utf-8 welcome.java，编译后生成class文件；  运行：java -Dfile.encoding=utf-8  Welcome，运行的是class文件
3. javap 主要用于帮助开发者深入了解 Java 编译器的机制，javap -c Welcome