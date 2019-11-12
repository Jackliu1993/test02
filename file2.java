import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6109155389436824537L;

//	url:  http://localhost:8080/01-helloWorld/customerAction_save.action
	public String save() throws Exception {
		System.out.println("CustomerAction.save()----invoked");
		return SUCCESS;
	}
}
