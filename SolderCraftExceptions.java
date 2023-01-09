import java.lang.Exception;

public class SolderCraftExceptions {
	//Basic Network Exception
	public NetworkException(String messsage) {
		super(message);
	};
	//Cannot connect to update server
	public CannotUpdateException(String message) {
		super(message);
	};
}
	
