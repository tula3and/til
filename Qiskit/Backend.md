## Backend

![circuit](https://user-images.githubusercontent.com/62553200/93866053-27efa480-fd02-11ea-97b2-5616d3885fb4.png)

- Aer `qasm_simulator`
  ```python
  simulator = Aer.get_backend('qasm_simulator')
  result = execute(circuit, backend = simulator).result()
  
  from qiskit.tools.visualization import plot_histogram
  plot_histogram(result.get_counts(circuit))
  ```

![Aer](https://user-images.githubusercontent.com/62553200/93866062-29b96800-fd02-11ea-8e38-b10c2f36e747.png)

- IBM `real quantum device`
  ```python
  from qiskit import IBMQ

  #Get API Token from IBM Q Experience
  IBMQ.save_account("<API Token>")
  IBMQ.load_account()
  provider = IBMQ.get_provider('ibm-q')
  qcomp = provider.get_backend('ibmq_16_melbourne')
  job = execute(circuit, backend=qcomp)
  
  from qiskit.tools.monitor import job_monitor
  job_monitor(job)

  result = job.result()
  plot_histogram(result.get_counts(circuit))
  ```
  
![Real](https://user-images.githubusercontent.com/62553200/93866069-2aea9500-fd02-11ea-8087-dac2c5e552f5.png)

- Aer `qasm_simulator` is better to use!
  - IBM `real quantum device` takes `more time` and `more errors`.
  - Real devices is sensitive with small quantum errors.
