## Linear algebra

- Vector<br/>
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cvec%7Bv%7D%20%3D%20%28a%2Cb%29%20%3D%5Cbegin%7Bbmatrix%7D%20a%5C%5C%20b%20%5Cend%7Bbmatrix%7D)
- Real coordinate space of n dimensions: 
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cmathbb%7BR%7D%5En)
- Linear combination: vector a, b have different slopes.<br/>
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20span%28%5Cvec%7Ba%7D%2C%20%5Cvec%7Bb%7D%29%20%3D%20%5Cmathbb%7BR%7D%5E2)
  - If they have same slope, the result is line and it means they are linearly dependent.
- Linear independence: <br/>
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20S%3D%5Cleft%20%5C%7B%20v_%7B1%7D%2Cv_%7B2%7D%2C%5Ccdots%2Cv_%7Bn%7D%20%5Cright%20%5C%7D)<br/> 
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20c_%7B1%7Dv_%7B1%7D%20&plus;%20c_%7B2%7Dv_%7B2%7D%20&plus;%20%5Ccdots%20&plus;%20c_%7Bn%7Dv_%7Bn%7D%20%3D%20%5Cvec%7B0%7D)
  - To satisfy the equation above
    - Non-zero for `some c`: `S` is linearly dependent
    - Zero for `all c`: `S` is linearly independent
- Linear subspace: V is subset of ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cmathbb%7BR%7D%5En)
  - Conditions that V to be a subspace
    1. Contains ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cvec%7B0%7D)
    2. Closed under multiplication: ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20c%5Cvec%7Bx%7D) in V
    3. Closed under addition: ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cvec%7Ba%7D%2C%5Cvec%7Bb%7D) in V
    ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5CRightarrow%20%5Cvec%7Ba%7D&plus;%5Cvec%7Bb%7D) in V
  - Dimension of a subspace: the number of elements in a basis for the subspace
- Basis: linearly independent minimum set of span subspace
  - Standard basis<br/>
  ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20T%20%3D%5Cleft%20%5C%7B%20%5Cbegin%7Bbmatrix%7D%201%5C%5C%200%20%5Cend%7Bbmatrix%7D%2C%20%5Cbegin%7Bbmatrix%7D%200%5C%5C%201%20%5Cend%7Bbmatrix%7D%20%5Cright%20%5C%7D)

---

- Dot product<br/>
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cvec%7Ba%7D%5Ccdot%5Cvec%7Bb%7D%3D%7C%7C%5Cvec%7Ba%7D%7C%7C%20%7C%7C%5Cvec%7Bb%7D%7C%7Ccos%5Ctheta%20%3D%5Cbegin%7Bbmatrix%7D%20a_%7B1%7D%5C%5C%20a_%7B2%7D%5C%5C%20%5Cvdots%20%5C%5C%20a_%7Bn%7D%20%5Cend%7Bbmatrix%7D%5Ccdot%20%5Cbegin%7Bbmatrix%7D%20b_%7B1%7D%5C%5C%20b_%7B2%7D%5C%5C%20%5Cvdots%20%5C%5C%20b_%7Bn%7D%20%5Cend%7Bbmatrix%7D%3D%5Csum_%7Bk%3D1%7D%5E%7Bn%7Da_%7Bk%7Db_%7Bk%7D)
- Length<br/>
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%7C%7C%5Cvec%7Ba%7D%7C%7C%20%3D%20%5Csqrt%7B%28a_%7B1%7D%29%5E2&plus;%28a_%7B2%7D%29%5E2&plus;%5Ccdots%20&plus;%28a_%7Bn%7D%29%5E2%7D%20%3D%20%5Csqrt%7B%5Cvec%7Ba%7D%5Ccdot%20%5Cvec%7Ba%7D%7D)
- Cauchy–Schwarz inequality<br/>
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%7C%5Cvec%7Bx%7D%5Ccdot%20%5Cvec%7By%7D%7C%20%5Cleq%20%7C%7C%5Cvec%7Bx%7D%7C%7C%20%7C%7C%5Cvec%7By%7D%7C%7C)
  - Equality holds if and only if ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cvec%7Bx%7D%20%3D%20c%5Cvec%7By%7D)
- Cross product: only defined ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cmathbb%7BR%7D%5E3)<br/>
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cvec%7Bn%7D%20%3D%20%5Cvec%7Ba%7D%5Ctimes%20%5Cvec%7Bb%7D%20%3D%20%5Cbegin%7Bbmatrix%7D%20a_%7B2%7Db_%7B3%7D-%20a_%7B3%7Db_%7B2%7D%5C%5C%20a_%7B3%7Db_%7B1%7D-%20a_%7B1%7Db_%7B3%7D%20%5C%5C%20a_%7B1%7Db_%7B2%7D-%20a_%7B2%7Db_%7B1%7D%20%5Cend%7Bbmatrix%7D)
  - Length of the cross product: area of parallelogram<br/>
  ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%7C%7C%5Cvec%7Ba%7D%5Ctimes%20%5Cvec%7Bb%7D%7C%7C%20%3D%20%7C%7C%5Cvec%7Ba%7D%7C%7C%7C%7C%5Cvec%7Bb%7D%7C%7Csin%5Ctheta)
  - Triple vector product<br/>
  ![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20%5Cvec%7Ba%7D%5Ctimes%28%5Cvec%7Bb%7D%5Ctimes%20%5Cvec%7Bc%7D%29%20%3D%20%5Cvec%7Bb%7D%28%5Cvec%7Ba%7D%5Ccdot%20%5Cvec%7Bc%7D%29%20-%20%5Cvec%7Bc%7D%28%5Cvec%7Ba%7D%5Ccdot%20%5Cvec%7Bb%7D%29)
- Point distance to plane<br/>
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20l%20%3D%20%5Cfrac%7B%7C%5Cvec%7BAP%7D%5Ccdot%20%5Cvec%7Bn%7D%7C%7D%7B%7C%7C%5Cvec%7Bn%7D%7C%7C%7D%20%3D%20%5Cfrac%7B%7Cax_%7B1%7D&plus;by_%7B1%7D&plus;cz_%7B1%7D-d%7C%7D%7B%5Csqrt%7Ba%5E2&plus;b%5E2&plus;c%5E2%7D%7D)
  - Plane: ax + by + cz = d
- Null space `N(A)` = `N(rref(A))`
  - dim(N(A)) = nullity(A) = the number of free variables = the number of non-pivot columns in rref
- Column space `C(A)`
  - dim(C(A)) = rank(A) = the number of pivot columns in rref
  - If (rank(A) == the dimension of codomain): the function is a surjective function
    - Surjective function: codomain = range

---

- Matrix-vector products
  - NOT satisfy the commutative property
  - A: m x n, B: p x q, AB: m(row) x q(column) (n and p must be same)
- Inverse matrix
  - `[A|I]` → `[I|A^-1]`
  - Determinant of 2 x 2 matrix: Det(`<matrix>`) = ad - bc != 0<br/>
  ![](https://latex.codecogs.com/gif.latex?%5Cbegin%7Bbmatrix%7D%20a%20%26%20b%26%20%7C%20%26%201%20%26%200%5C%5C%20c%20%26%20d%20%26%20%7C%20%26%200%26%201%20%5Cend%7Bbmatrix%7D%20%3D%20%5Cbegin%7Bbmatrix%7D%20a%20%26%20b%26%20%7C%20%26%201%20%26%200%5C%5C%200%20%26%20ad-bc%20%26%20%7C%20%26%20-c%26%20a%20%5Cend%7Bbmatrix%7D%20%3D%20%5Cbegin%7Bbmatrix%7D%20%28ad-bc%29a%20%26%200%26%20%7C%20%26%20ad%20%26%20-ab%5C%5C%200%20%26%20ad-bc%20%26%20%7C%20%26%20-c%26%20a%20%5Cend%7Bbmatrix%7D%3D%20%5Cbegin%7Bbmatrix%7D%201%20%26%200%26%20%7C%20%26%20%5Cfrac%7Bd%7D%7Bad-bc%7D%20%26%20%5Cfrac%7B-b%7D%7Bad-bc%7D%5C%5C%200%20%26%201%20%26%20%7C%20%26%20%5Cfrac%7B-c%7D%7Bad-bc%7D%26%20%5Cfrac%7Ba%7D%7Bad-bc%7D%20%5Cend%7Bbmatrix%7D)
  

---

- Projections: projection of x onto L<br/>
![](https://latex.codecogs.com/gif.latex?%5Cfn_jvn%20Proj_%7BL%7D%28%5Cvec%7Bx%7D%29%20%3D%20%28%5Cfrac%7B%5Cvec%7Bx%7D%5Ccdot%20%5Cvec%7Bv%7D%7D%7B%5Cvec%7Bv%7D%5Ccdot%20%5Cvec%7Bv%7D%7D%29%5Ccdot%20%5Cvec%7Bv%7D%20%3D%20%28%5Cvec%7Bv%7D%5Ccdot%5Chat%7Bu%7D%29%5Ccdot%5Chat%7Bu%7D)





