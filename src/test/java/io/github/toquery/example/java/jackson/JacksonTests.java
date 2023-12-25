package io.github.toquery.example.java.jackson;

import org.junit.jupiter.api.Test;

/**
 *
 */
public class JacksonTests {

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
