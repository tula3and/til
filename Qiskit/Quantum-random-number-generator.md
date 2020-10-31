## Quantum random number generator - with H gate

```python
from qiskit import *
%matplotlib inline
```

```python
qr = QuantumRegister(5)
cr = ClassicalRegister(5)
circuit = QuantumCircuit(qr,cr)
circuit.h(qr)
circuit.measure(qr,cr)
circuit.draw('mpl')
```

![circuit](https://user-images.githubusercontent.com/62553200/97778266-82113e80-1bb9-11eb-9a82-299adce897e7.png)


```python
from qiskit.tools.visualization import plot_histogram
backend = Aer.get_backend('qasm_simulator')
result = execute(circuit, backend, shot=100, memory=True).result()
val = result.get_memory()
print(val) #['00001', '01000', ... , '01010', '01101']
```

```python
counts = result.get_counts()
print(counts)

#{'00000': 31, '00001': 35, '10000': 34, '10001': 35,
# '10010': 30, '10011': 35, '10100': 33, '10101': 24,
# '10110': 47, '10111': 26, '11000': 32, '11001': 26,
# '11010': 33, '11011': 39, '11100': 28, '11101': 26,
# '11110': 25, '11111': 27, '00010': 29, '00011': 31,
# '00100': 27, '00101': 42, '00110': 31, '00111': 31,
# '01000': 30, '01001': 36, '01010': 43, '01011': 23,
# '01100': 34, '01101': 30, '01110': 30, '01111': 41}
```

```python
plot_histogram(counts)
```

![result](https://user-images.githubusercontent.com/62553200/97778268-83426b80-1bb9-11eb-9e0a-d57053893186.png)
