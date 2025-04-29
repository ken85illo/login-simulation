#!/bin/bash

rm -f bin/*
javac -d bin -sourcepath src src/*.java 
java -classpath bin Window
