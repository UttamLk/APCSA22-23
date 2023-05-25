/*
 * Activity 2.5.2
 *
 * The runner for the PhraseSolverGame
 */
import java.util.Random;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Runner {
  public static void main(String[] args) {
    PhraseSolver p = new PhraseSolver();
    p.play();

  }
}