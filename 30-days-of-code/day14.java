	// Add your code here
    Difference(int[] elements){
        this.elements = elements;
    }
    public void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1]-elements[0];    
    }
    


