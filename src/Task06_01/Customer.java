package Task06_01;

class Customer {
    {
        idGenerator++;
    }
 
    private static int idGenerator = 0;
    private int id = idGenerator;
    private String Name;
    private String Name2;
    private int Sum;
    private String Status;
	private int PersonId;

    Customer(int PersonId, String Name2, String Name, int Sum, String Status) {
    	
        this.Name = Name;
        this.Name2 = Name2;
        this.Sum = Sum;
        this.Status = Status;
        this.PersonId = PersonId;
        
    }
    
	public String getName() {
        return Name;
    }
 
    public String getName2() {
        return Name2;
    }
 
    public int getSum() {
        return Sum;
    }
 
    public String getStatus() {
        return Status;
    }
    
    public int getPersonId() {
        return PersonId;
    }
    
    public void setStatus(String status) {
		Status = status;
	}
 
    public String toString() {
        return String.format("ID: %d\t Personal ID : %d\t Name2: %s\t Name: %s\t Sum: %d\t Status: %s\t ",
                id, PersonId, Name2, Name, Sum, Status);
    }
 
}