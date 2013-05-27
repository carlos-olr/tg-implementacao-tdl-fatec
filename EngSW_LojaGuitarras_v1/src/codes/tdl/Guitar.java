package codes.tdl;

public class Guitar {

	private String serialNumber;
	private double price;
	private String builder;
	private String model;
	private String type;
	private String topWood;
	private String backWood;

	public Guitar(String serialNumber, double price, String builder, String model,
			String type, String topWood, String backWood) {
		this.setSerialNumber(serialNumber);
		this.setPrice(price);
		this.setBuilder(builder);
		this.setModel(model);
		this.setType(type);
		this.setTopWood(topWood);
		this.setBackWood(backWood);
	}
	
	public Guitar() {
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
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
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber
	 *            the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
