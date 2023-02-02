## :file_folder: Jenamer
Mass file renamer developed in Java 17.

---

### :pushpin: Objective
Solve the following situation: you have a directory with MANY disorganized files, how much time/effort would it take to rename them one by one? Jenamer renames all files based on a template name + separator + index.

---

### :link: Requirements
- Maven
- Java 8+
- Windows/Linux
- Terminal (console)

---

### :cd: Setup
1- Open pom.xml and configure your Java version on these lines:
```
<java.version>17</java.version>
<maven.compiler.source>17</maven.compiler.source>
<maven.compiler.target>17</maven.compiler.target>
```
2- Via terminal navigate to the Jenamer root directory and run `mvn install`

---

### :arrow_forward: How to use
`java -jar [jar path] [first argument] [second argument] [third argument]`

- First argument: full path to the target directory (if there are spaces you must enclose them in quotes)
- Second argument: template name, example -> "file"
- Third argument: index separator, example -> "-"

Command: `java -jar .\target\Jenamer-1.0-SNAPSHOT.jar "C:\Users\vitor\Desktop\Test" file -`

---

### :busts_in_silhouette: Do you want help me?

If you have any ideas or wish to contribute to the project, contact me on Twitter @vituohto or send me a pull request! :)

---

### :white_flag: License
```
MIT License

Copyright (c) 2023 @vituohto

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
