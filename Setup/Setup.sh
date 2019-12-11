#!/bin/bash
echo "alias ArgumentScript='sh $PWD/ArgumentScript.sh \$1'" >> $HOME/.bashrc
echo "java -jar $PWD/ArgumentScript.jar \$1" >> $PWD/ArgumentScript.sh
echo "javac Out.java" >> $PWD/ArgumentScript.sh
echo "java Out" >> $PWD/ArgumentScript.sh
