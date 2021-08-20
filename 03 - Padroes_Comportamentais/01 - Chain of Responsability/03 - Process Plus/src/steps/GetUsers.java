package steps;

import repository.UserRepository;
import service.ProcessContext;

public class GetUsers extends ProcessStep {
	
	public GetUsers(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object users = UserRepository.getInstance().getUsers();
		context.put("users", users);
		return next(context, users);
	}

}
