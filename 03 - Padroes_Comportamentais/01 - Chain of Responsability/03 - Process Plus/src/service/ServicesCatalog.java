package service;

import steps.CheckPassword;
import steps.CreateMap;
import steps.GetUserByEmail;
import steps.GetUserToken;
import steps.GetUsers;
import steps.ProcessStep;
import steps.SaveUser;
import steps.ValidateMandatoryField;
import steps.ValidateToken;

public class ServicesCatalog {
	
	public static ProcessStep saveUserProcess = buildChain(
			new CreateMap("input"),
			new ValidateMandatoryField("input.name"),
			new ValidateMandatoryField("input.email"),
			new ValidateMandatoryField("input.password"),
			new SaveUser());
	
	public static ProcessStep loginProcess = buildChain(
			new CreateMap("input"),
			new ValidateMandatoryField("input.email"),
			new ValidateMandatoryField("input.password"),
			new GetUserByEmail(),
			new CheckPassword(),
			new GetUserToken());
	
	public static ProcessStep getUsersProcess = buildChain(
			new ValidateToken(),
			new GetUsers());
	
	private static ProcessStep buildChain(ProcessStep... steps) {
		for(int index = 0; index < steps.length -1; index++) {
			ProcessStep currentProcess = steps[index];
			currentProcess.setNextStep(steps[index + 1]);
		}
		return steps[0];
	}
}
