package codes.tdl;

public class Spec {

	private String builder;
	private String model;
	private String type;
	private String topWood;
	private String backWood;
	private int numStrings;

	public Spec(String builder, String model, String type, String topWood,
			String backWood, int strings) {
		this.setBuilder(builder);
		this.setModel(model);
		this.setType(type);
		this.setTopWood(topWood);
		this.setBackWood(backWood);
		this.setNumStrings(strings);
	}

	public Spec() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the builder
	 */
	public String getBuilder() {
		return builder;
	}

	/**
	 * @param builder
	 *            the builder to set
	 */
	public void setBuilder(String builder) {
		this.builder = builder;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the topWood
	 */
	public String getTopWood() {
		return topWood;
	}

	/**
	 * @param topWood
	 *            the topWood to set
	 */
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

	/**
	 * @return the backWood
	 */
	public String getBackWood() {
		return backWood;
	}

	/**
	 * @param backWood
	 *            the backWood to set
	 */
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	/**
	 * @return the numStrings
	 */
	public int getNumStrings() {
		return numStrings;
	}

	/**
	 * @param numStrings
	 *            the numStrings to set
	 */
	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}

	public boolean matches(Spec specAComparar) {
		if (!this.getBuilder().equals(specAComparar.getBuilder()))
			return false;
		if (!this.getModel().equals(specAComparar.getModel()))
			return false;
		if (!this.getType().equals(specAComparar.getType()))
			return false;
		if (!this.getTopWood().equals(specAComparar.getTopWood()))
			return false;
		if (!this.getBackWood().equals(specAComparar.getBackWood()))
			return false;
		if (this.getNumStrings() != specAComparar.getNumStrings())
			return false;
		return true;
	}

}
