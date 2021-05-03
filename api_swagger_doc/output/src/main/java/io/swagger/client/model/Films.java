/*
 * Studio Ghibli API
 * # Studio Ghibli API   The Studio Ghibli API catalogs the people, places, and things found in the worlds of Ghibli. It was created to help users discover resources, consume them via HTTP requests, and interact with them in whatever way makes sense. Navigation can be found on the left sidebar, and the right sidebar shows examples of returned objects for successful calls.    Users can raise an issue, ask for help, or find a contribution guide at the main repo: [https://github.com/janaipakos/ghibliapi](https://github.com/janaipakos/ghibliapi)  # Getting Started   Requests can be made with `curl` or other helper libraries by following regular REST calls. For example, here is how to GET the resource for the film *My Neighbor Tororo*:    `curl https://ghibliapi.herokuapp.com/films/58611129-2dbc-4a81-a72f-77ddfc1b1b49`    Calling this resource will respond with the following object:    ```json   {   \"id\": \"58611129-2dbc-4a81-a72f-77ddfc1b1b49\",   \"title\": \"My Neighbor Totoro\",   \"original_title\": \"となりのトトロ\",   \"original_title_romanised\": \"Tonari no Totoro\",   \"description\": \"Two sisters move to the country with their father in order to be closer to their hospitalized mother, and discover the surrounding trees are inhabited by Totoros, magical spirits of the forest. When the youngest runs away from home, the older sister seeks help from the spirits to find her.\",   \"director\": \"Hayao Miyazaki\",   \"producer\": \"Hayao Miyazaki\",   \"release_date\": \"1988\",   \"running_time\": \"86\",   \"rt_score\": \"93\",   ...   }   ```  # Base URL   Users must prepend all resource calls with this base URL:    `https://ghibliapi.herokuapp.com`  # Authentication    There is no authentication necessary for the Studio Ghibli API.  # Workflow   Endpoints can be used by themselves, or combined with one another to retrieve more specific information. An example workflow is listed below:    ### Goal: Get a list of people with the species classification as \"spirit.\"     - Call the species endpoint with `/species?name=spirit`     - Call the people listed under this endpoint with `/people/<uuid>`     - Combine these results   # Use Case   There are numerous ways for users to interact with the platform. For example, with the \"people\" API, users can get customized information about people, such as eye and hair color. Another example is using the \"species\"\" API to find the different films each creature appears in. A more concrete case study is listed below:    ### A use case for finding information on all the cats of Studio Ghibli.    Using the Aeson library in Haskell, the user can parse the `people` array to return all of the cats, listed under `/species/603428ba-8a86-4b0b-a9f1-65df6abef3d3`    ```haskell   import qualified Data.ByteString.Lazy as L   import GHC.Generics   import Data.Aeson    main = do       fileData <- L.readFile \"cats.json\"       let ghibliResponse = decode fileData :: Maybe GhibliCatResponse       let ghibliResults = people <$> ghibliResponse       findCat ghibliResults    findCat :: Maybe [GhibliCatResult] -> IO ()   findCat Nothing = print \"data not found\"   findCat (Just people) = do       print $ T.pack \"Studio Ghibli Cats:\"       forM_ people $ \\person -> do           let dataName = name person           let dataGender = gender person           let dataAge = age person           let dataHairColor = hairColor person           let dataEyeColor = eyeColor person           let dataFilms = films person           print $ T.concat [T.pack 'name: ', dataName                            ,T.pack ', gender: ', dataGender                            ,T.pack ', age: ', dataAge                            ,T.pack ', hair color: ', dataHairColor                            ,T.pack ', eye color: '', dataEyeColor                            ]   ```    The above code will return an IO Action of the requested cats.    ```   \"Studio Ghibli Cats:\"   \"name: Jiji, gender: Male, hair color: Black, eye color: Black\"   \"name: Catbus, gender: Male, hair color: Brown, eye color: Yellow\"   \"name: Niya, gender: Male, hair color: Beige, eye color: White\"   \"name: Renaldo Moon aka Moon aka Muta, gender: Male, hair color: Beige, eye color: White\"   \"name: Cat King, gender: Male, hair color: Grey, eye color: Emerald\"   \"name: Yuki, gender: Female, hair color: White, eye color: Blue\"   \"name: Haru, gender: Female, hair color: Brown, eye color: Brown\"   \"name: Baron Humbert von Gikkingen, gender: Male, hair color: Yellow, eye color: Green\"   \"name: Natori, gender: Male, hair color: Grey, eye color: Blue\"   ```  # Helper Libraries    ## Elixir   - [ghibli](https://github.com/sotojuan/ghibli) by [Juan Soto](https://github.com/sotojuan) 
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Films
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-03T11:35:21.292+02:00")
public class Films {
  @SerializedName("id")
  private String id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("original_title")
  private String originalTitle = null;

  @SerializedName("original_title_romanised")
  private String originalTitleRomanised = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("director")
  private String director = null;

  @SerializedName("producer")
  private String producer = null;

  @SerializedName("release_date")
  private String releaseDate = null;

  @SerializedName("running_time")
  private String runningTime = null;

  @SerializedName("rt_score")
  private String rtScore = null;

  @SerializedName("people")
  private List<String> people = null;

  @SerializedName("species")
  private List<String> species = null;

  @SerializedName("locations")
  private List<String> locations = null;

  @SerializedName("vehicles")
  private List<String> vehicles = null;

  @SerializedName("url")
  private String url = null;

  public Films id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a specific film
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific film")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Films title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the film
   * @return title
  **/
  @ApiModelProperty(value = "Title of the film")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Films originalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
    return this;
  }

   /**
   * Original title of the film
   * @return originalTitle
  **/
  @ApiModelProperty(value = "Original title of the film")
  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  public Films originalTitleRomanised(String originalTitleRomanised) {
    this.originalTitleRomanised = originalTitleRomanised;
    return this;
  }

   /**
   * Orignal title in romanised form
   * @return originalTitleRomanised
  **/
  @ApiModelProperty(value = "Orignal title in romanised form")
  public String getOriginalTitleRomanised() {
    return originalTitleRomanised;
  }

  public void setOriginalTitleRomanised(String originalTitleRomanised) {
    this.originalTitleRomanised = originalTitleRomanised;
  }

  public Films description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the film
   * @return description
  **/
  @ApiModelProperty(value = "Description of the film")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Films director(String director) {
    this.director = director;
    return this;
  }

   /**
   * Director of the film
   * @return director
  **/
  @ApiModelProperty(value = "Director of the film")
  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public Films producer(String producer) {
    this.producer = producer;
    return this;
  }

   /**
   * Producer of the film
   * @return producer
  **/
  @ApiModelProperty(value = "Producer of the film")
  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public Films releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Release year of film
   * @return releaseDate
  **/
  @ApiModelProperty(value = "Release year of film")
  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Films runningTime(String runningTime) {
    this.runningTime = runningTime;
    return this;
  }

   /**
   * Running time of the film in minutes
   * @return runningTime
  **/
  @ApiModelProperty(value = "Running time of the film in minutes")
  public String getRunningTime() {
    return runningTime;
  }

  public void setRunningTime(String runningTime) {
    this.runningTime = runningTime;
  }

  public Films rtScore(String rtScore) {
    this.rtScore = rtScore;
    return this;
  }

   /**
   * Rotten Tomato score of film
   * @return rtScore
  **/
  @ApiModelProperty(value = "Rotten Tomato score of film")
  public String getRtScore() {
    return rtScore;
  }

  public void setRtScore(String rtScore) {
    this.rtScore = rtScore;
  }

  public Films people(List<String> people) {
    this.people = people;
    return this;
  }

  public Films addPeopleItem(String peopleItem) {
    if (this.people == null) {
      this.people = new ArrayList<String>();
    }
    this.people.add(peopleItem);
    return this;
  }

   /**
   * People found in film
   * @return people
  **/
  @ApiModelProperty(value = "People found in film")
  public List<String> getPeople() {
    return people;
  }

  public void setPeople(List<String> people) {
    this.people = people;
  }

  public Films species(List<String> species) {
    this.species = species;
    return this;
  }

  public Films addSpeciesItem(String speciesItem) {
    if (this.species == null) {
      this.species = new ArrayList<String>();
    }
    this.species.add(speciesItem);
    return this;
  }

   /**
   * Species found in film
   * @return species
  **/
  @ApiModelProperty(value = "Species found in film")
  public List<String> getSpecies() {
    return species;
  }

  public void setSpecies(List<String> species) {
    this.species = species;
  }

  public Films locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public Films addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<String>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Locations found in film
   * @return locations
  **/
  @ApiModelProperty(value = "Locations found in film")
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public Films vehicles(List<String> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public Films addVehiclesItem(String vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<String>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * Vehicles found in film
   * @return vehicles
  **/
  @ApiModelProperty(value = "Vehicles found in film")
  public List<String> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<String> vehicles) {
    this.vehicles = vehicles;
  }

  public Films url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of film
   * @return url
  **/
  @ApiModelProperty(value = "URL of film")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Films films = (Films) o;
    return Objects.equals(this.id, films.id) &&
        Objects.equals(this.title, films.title) &&
        Objects.equals(this.originalTitle, films.originalTitle) &&
        Objects.equals(this.originalTitleRomanised, films.originalTitleRomanised) &&
        Objects.equals(this.description, films.description) &&
        Objects.equals(this.director, films.director) &&
        Objects.equals(this.producer, films.producer) &&
        Objects.equals(this.releaseDate, films.releaseDate) &&
        Objects.equals(this.runningTime, films.runningTime) &&
        Objects.equals(this.rtScore, films.rtScore) &&
        Objects.equals(this.people, films.people) &&
        Objects.equals(this.species, films.species) &&
        Objects.equals(this.locations, films.locations) &&
        Objects.equals(this.vehicles, films.vehicles) &&
        Objects.equals(this.url, films.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, originalTitle, originalTitleRomanised, description, director, producer, releaseDate, runningTime, rtScore, people, species, locations, vehicles, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Films {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    originalTitleRomanised: ").append(toIndentedString(originalTitleRomanised)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    director: ").append(toIndentedString(director)).append("\n");
    sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    runningTime: ").append(toIndentedString(runningTime)).append("\n");
    sb.append("    rtScore: ").append(toIndentedString(rtScore)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

