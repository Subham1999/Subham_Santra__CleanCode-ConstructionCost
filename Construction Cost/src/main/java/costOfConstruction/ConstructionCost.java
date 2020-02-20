package costOfConstruction;

public class ConstructionCost {
	private double constructionArea;
	private int[] standardsOfMaterial = {1200, 1500, 1800, 2500};
	private int standardOfMaterial;
	public ConstructionCost() {
		super();
	}
	public void setConstructionArea(double area) {
		this.constructionArea = area;
	}
	public void setStandardOfMaterial(int SOM) {
		this.standardOfMaterial = SOM;
	}
	public double getContructionCost() {
		return this.constructionArea*this.standardsOfMaterial[this.standardOfMaterial];
	}
}
