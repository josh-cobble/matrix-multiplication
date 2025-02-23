# matrix-multiplication

Welcome to the random matrix maker! Enter an integer between 1 and 100 to see a random square matrix generated.
Note that this is inclusive of 1 and 100, meaning they can be entered as inputs, along with any numbers in between.
No fractional or non-integer inputs are allowed to be entered. This is because the program will create 2 x by x matrices
using the integer you put in as x. It then takes these 2 matrices, performs matrix multiplication, and then outputs a third matrix.

Each matrix is stored to its own file. The first matrix created is stored to matrix1.txt, the second is stored to matrix2.txt,
and the third (which is created after performing matrix multiplication) is stored to matrix3.txt.
Note that all of these matrices will also appear in the terminal after being created, showing you they have been created
successfully.

Heres an example of how the progam works: if you enter 10, two 10 x 10 matrices will be created. The program will then perform
matrix multiplication, creating the third matrix. Each matrix will contain 10 numbers per row.

You can enter as many integers as you wish. Each time you enter a new integer, the program will reset, causing new matrices
that disregard your other matrices to be made.

To exit the program, enter "-1" (without quotation marks).

Note that while it is possible for the program to create matrices larger than 100 x 100, these matrices would be very hard to read
and would fill a lot of the screen.
