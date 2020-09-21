## Backend

- Aer `qasm_simulator`
  ```python
  simulator = Aer.get_backend('qasm_simulator')
  job = execute(circuit, backend = simulator)
  ```
- IBM `real quantum device`
  ```python
  from qiskit import IBMQ

  #Get API Token from IBM Q Experience
  IBMQ.save_account("")
  IBMQ.load_account()
  provider = IBMQ.get_provider('ibm-q')
  qcomp = provider.get_backend('ibmq_16_melbourne')
  job = execute(circuit, backend=qcomp)
  ```
- Aer `qasm_simulator` is better to use!
  - IBM `real quantum device` takes `more time` and `more errors`.
  - Real devices is sensitive with small quantum errors.
