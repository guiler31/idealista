/**
 * 
 */
package modelo;

import java.util.ArrayList;

/**
 * @author guille
 *
 */
public class Anuncio {
	
	private Integer id;
	private String description;
	private String typology;
	private Integer houseSize;
	private Integer gardenSize;
	
	public Anuncio(Integer id, String description, String typology, Integer houseSize, Integer gardenSize) {
		super();
		this.id = id;
		this.description = description;
		this.typology = typology;
		this.houseSize = houseSize;
		this.gardenSize = gardenSize;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypology() {
		return typology;
	}

	public void setTypology(String typology) {
		this.typology = typology;
	}

	public Integer getHouseSize() {
		return houseSize;
	}

	public void setHouseSize(Integer houseSize) {
		this.houseSize = houseSize;
	}

	public Integer getGardenSize() {
		return gardenSize;
	}

	public void setGardenSize(Integer gardenSize) {
		this.gardenSize = gardenSize;
	}
	
	
	
	
}
