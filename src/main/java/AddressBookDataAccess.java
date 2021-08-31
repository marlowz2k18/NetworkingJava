// Fig. 8.34: AddressBookDataAccess.java
// Interface that specifies the methods for inserting,
// updating, deleting and finding records.

// Java core packages

import java.sql.SQLException;

public interface AddressBookDataAccess {
      
   // Locate specified person by last name. Return 
   // AddressBookEntry containing information.
   public AddressBookEntry findPerson( String lastName , int personID);

   // Returns int number of highest personID in database
   public int countEntries() throws SQLException;

   // Update information for specified person.
   // Return boolean indicating success or failure.
   public boolean savePerson( AddressBookEntry person ) throws DataAccessException;

   // Insert a new person. Return boolean indicating 
   // success or failure.
   public boolean newPerson( AddressBookEntry person ) throws DataAccessException;
      
   // Delete specified person. Return boolean indicating if 
   // success or failure.
   public boolean deletePerson( AddressBookEntry person ) throws DataAccessException;
      
   // close data source connection
   public void close();

}  // end interface AddressBookDataAccess