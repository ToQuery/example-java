package io.github.toquery.example.java.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.toquery.example.java.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

/**
 *
 */
public class JacksonTests {
    @Test
    public void testTypeReference() throws JsonProcessingException {
        String input = "";
        ObjectMapper objectMapper = Jackson.getObjectMapper();
        // returns List<CartItem>
        objectMapper.readValue(input, new TypeReference<List<User>>() {
        });

        // returns CartItem[]
        objectMapper.readValue(input, new TypeReference<User[]>() {
        });

        // returns Map<String, CartItem>
        objectMapper.readValue(input, new TypeReference<Map<String, User>>() {
        });

    }

    @Test
    public void testObjectReader() throws JsonProcessingException {
        String input = "";
        ObjectMapper objectMapper = Jackson.getObjectMapper();
        // returns List<User>
        objectMapper.readerForListOf(User.class).readValue(input);

        // returns User[]
        objectMapper.readerForArrayOf(User.class).readValue(input);

        // returns Map<String, User>
        objectMapper.readerForMapOf(User.class).readValue(input);

    }

    @Test
    public void test() throws Exception {
        String json = """
                {
                    "code": 0,
                    "success": true,
                    "content": {
                        "authorities": [
                            {
                                "permission": "homepage"
                            },
                            {
                                "permission": "projectmain"
                            },
                            {
                                "permission": "projectscreen"
                            },
                            {
                                "permission": "projectpage"
                            },
                            {
                                "permission": "projectmanager"
                            },
                            {
                                "permission": "personnel"
                            },
                            {
                                "permission": "dataissue"
                            }
                        ]
                    }
                }
                """;

//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode root = objectMapper.readTree(json);
//        JsonNode lists = root.findPath("content").findPath("authorities").findValuesAsText("permission");
    }
}
