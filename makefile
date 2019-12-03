antlr4 := /usr/local/lib/antlr-4.7.1-complete.jar

all: Main.java
	javac ArgumentScript*.java
	javac Main.java

antlr: ArgumentScript.g4
	java -Xmx500m -cp "$(antlr4):$CLASSPATH" org.antlr.v4.Tool ArgumentScript.g4

#gui:
#    java -Xmx500m -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig ArgumentScript file -gui

clean:
	rm *.class
