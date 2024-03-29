package cube;

public class SinusHeatCube implements Cube {

	private static final int STEP_WIDHT = 128;
	private float temp = 0;
	private int iteration = 0;
	
	public SinusHeatCube() {}

	@Override
	public float getCurrentTemp() {
		return temp;
	}
	
	@Override
	public void setInitTemp(float temp) {}
	
	@Override
	public void setNewTemp(float temp) {}
	
	@Override
	public void setNewTemp(Cube[][][] block, int x, int y, int z) {
		iteration = iteration % STEP_WIDHT;
		iteration = iteration + 1;
		temp = (float)Math.sin(Math.PI * ((float)iteration / STEP_WIDHT)) * 100;
	}
	
	@Override
	public void updateTemp() {}
}
