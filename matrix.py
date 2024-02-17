import numpy as np

# Create an array with numbers from 1 to 100
numbers = np.arange(1, 101)

# Reshape the array into a 10x10 matrix
matrix = numbers.reshape((10, 10))

# Print the matrix
for row in matrix:
    print(row)
