using System;
using System.IO;

namespace dataFiles
{
    class Program
    {
        static void Main(string[] args)
        {
            string readText = File.ReadAllText(@"C:\Users\Andrew Arguello\OneDrive\Documents\Coding-Pwnage\dataUse");
            string[] contents = Directory.GetFiles(readText);
            Console.WriteLine(contents[0]);
        }
    }
}
