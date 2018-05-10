package hu.csega.units;

@Unit
@DefaultImplementation(CustomTestServiceImpl.class)
public interface CustomTestService {

	int returnSameValue(int input);

}
