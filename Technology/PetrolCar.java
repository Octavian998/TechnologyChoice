package Technology;

import java.util.logging.Logger;

/**
 * THis class inherit {@link Car} class feature and provide following simulation process for Petrol Cars only:
 * <ul>
 * <li>a. Fill the fuel</li>
 * <li>b. Run test the petrol cars.</li>
 * </ul>
 * 
 * 
 * 
 */
public class PetrolCar extends Car {
	private static Logger LOGGER = Logger.getLogger(PetrolCar.class.getName());

	/**
	 * This method will simulate fuel filling process of {@link PetrolCar}
	 * 
	 * 
	 */
	public void fillFuel() {
		LOGGER.info("\n*******Filling petrol in  Petrol car*******\n");
	}

	/**
	 * This method will simulate running test of {@link PetrolCar}
	 * 
	 * 
	 */
	public void runTestPetrolCar() {
		LOGGER.info("\n*******Running test of Petrol car *******\n");
	}

	@Override
	public void navigate() {
		// TODO Auto-generated method stub
	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub
	}

}
