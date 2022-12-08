package simulaCompeticao;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LocalDateTypeAdapterAtleta implements JsonDeserializer<LocalDate>, JsonSerializer<LocalDate> {
	@Override
	public JsonElement serialize(LocalDate data, Type type, JsonSerializationContext context) {
		String dataString = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(dataString);
		JsonElement string = new JsonPrimitive(dataString);
		return string;
	}

	@Override
	public LocalDate deserialize(JsonElement src, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		// TODO Auto-generated method stub
		LocalDate data = LocalDate.parse(src.getAsString(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return data;
	}
}
