# direcciones-peru-client-java

Devuelve las direcciones asociadas a la persona consultada.

## Requisitos

1. Java >= 1.7
2. Maven >= 3.3

## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:

```shell
mvn install -Dmaven.test.skip=true
```

> **NOTA:** Este fragmento del comando *-Dmaven.test.skip=true* evitará que se lance la prueba unitaria.


## Guía de inicio

### Paso 1. Agregar el producto a la aplicación

Al iniciar sesión seguir los siguientes pasos:

 1. Dar clic en la sección "**Mis aplicaciones**".
 2. Seleccionar la aplicación.
 3. Ir a la pestaña de "**Editar '@tuApp**' ".
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/edit_applications.jpg" width="900">
    </p>
 4. Al abrirse la ventana emergente, seleccionar el producto.
 5. Dar clic en el botón "**Guardar App**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/selected_product.jpg" width="400">
    </p>

### Paso 2. Capturar los datos de la petición

Los siguientes datos a modificar se encuentran en ***src/test/java/com/cdc/apihub/pe/direcciones/api/DireccionesApiTest.java***

Es importante contar con el setUp() que se encargará de inicializar la url. Modificar la URL ***('the_url')*** de la petición del objeto ***$config***, como se muestra en el siguiente fragmento de código:

```java
 private final DireccionesApi api = new DireccionesApi();

@Before()
public void setUp() {
	ApiClient apiClient = api.getApiClient();
	apiClient.setBasePath("the_url");
}

```

En el archivo **DireccionesApiTest**, que se encuentra en ***src/test/java/com/cdc/apihub/pe/direcciones/api*** se deberá modificar el siguiente fragmento de código con los datos correspondientes:

```java
@Test
public void direccionesTest() throws ApiException {
    	String xApiKey = "your_api_key";
	Peticion request = new Peticion();
    	request.setTipoDocumento("X");
    	request.setNumeroDocumento("XXXXX");

	try {
		Respuesta response = api.direcciones(xApiKey, request);
		Assert.assertTrue(response != null);
	} catch (ApiException e) {
		System.out.println(e);
	}
}
```

### Paso 3. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```

---
[TERMS AND CONDITIONS](https://github.com/APIHub-CdC/licencias-cdc)