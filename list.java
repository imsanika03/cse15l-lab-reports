public class AList<E> implements List<E> {

    E[] elements;
    int size;
  
    @SuppressWarnings("unchecked")
    public AList() {
      //this.elements = new E[2];					// disallowed by Java
      this.elements = (E[])(new Object[2]);
      this.size = 0;
    }
  
    public void add(E s) {
      expandCapacity();
      this.elements[this.size] = s;
      this.size += 1;
    }
  
    public E get(int index) {
      if(index < 0 || index >= this.size) {
        throw new IndexOutOfBoundsException();
      }
      return this.elements[index];
    }
  
    public int size() {
      return this.size;
    }
  
    @SuppressWarnings("unchecked")
    private void expandCapacity() {
  
      int currentCapacity = this.elements.length;
      if(this.size < currentCapacity) { return; }
  
      // How to construct a new array here?
      // Create the new array that is twice is big
      E[] expanded = (E[]) new Object[currentCapacity * 2];
  
      for(int i = 0; i < this.size; i += 1) {
        expanded[i] = this.elements[i];
      }
      this.elements = expanded;
  
    }
  }

  AList< int > myList= new AList< int >();
List< Integer > myList1 = new AList< Integer >();
AList< AList< String >> myList2 = new AList< AList< String >>();
AList myList3< Integer > = new AList< Integer >();
AList< E > myList4 = new AList< String >();
AList< Object> myList5 = new AList< Object >();