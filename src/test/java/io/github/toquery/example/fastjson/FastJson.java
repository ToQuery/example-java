package io.github.toquery.example.fastjson;

import com.alibaba.fastjson.JSONArray;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 *
 */
public class FastJson {

    String json = "[\n" +
            "        {\n" +
            "            \"id\": \"1587398954841743361\",\n" +
            "            \"categoryName\": \"测试分类2\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 1,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"children\": [],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1587398954841743361],\",\n" +
            "                            \"parentCategoryId\": \"1587399009342529538\",\n" +
            "                            \"pid\": \"1587399009342529538\",\n" +
            "                            \"id\": \"1587399100178571265\",\n" +
            "                            \"sort\": 3,\n" +
            "                            \"categoryName\": \"测试分类2-1-1\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1587398954841743361\",\n" +
            "                    \"pid\": \"1587398954841743361\",\n" +
            "                    \"id\": \"1587399009342529538\",\n" +
            "                    \"sort\": 1,\n" +
            "                    \"categoryName\": \"测试分类2-1\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1587398954841743361\",\n" +
            "                    \"pid\": \"1587398954841743361\",\n" +
            "                    \"id\": \"1587399194093232130\",\n" +
            "                    \"sort\": 2,\n" +
            "                    \"categoryName\": \"测试分类2-2\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1369487530108399617\",\n" +
            "            \"categoryName\": \"运营管理\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 1,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369487530108399617\",\n" +
            "                    \"pid\": \"1369487530108399617\",\n" +
            "                    \"id\": \"1369902074354020353\",\n" +
            "                    \"sort\": 1,\n" +
            "                    \"categoryName\": \"新店开业流程\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"children\": [],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1369487530108399617],\",\n" +
            "                            \"parentCategoryId\": \"1586264550863220738\",\n" +
            "                            \"pid\": \"1586264550863220738\",\n" +
            "                            \"id\": \"1586264750268821505\",\n" +
            "                            \"sort\": 1,\n" +
            "                            \"categoryName\": \"公共课程\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"children\": [],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1369487530108399617],\",\n" +
            "                            \"parentCategoryId\": \"1586264550863220738\",\n" +
            "                            \"pid\": \"1586264550863220738\",\n" +
            "                            \"id\": \"1586299208904683521\",\n" +
            "                            \"sort\": 2,\n" +
            "                            \"categoryName\": \"迎宾岗1\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"children\": [],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1369487530108399617],\",\n" +
            "                            \"parentCategoryId\": \"1586264550863220738\",\n" +
            "                            \"pid\": \"1586264550863220738\",\n" +
            "                            \"id\": \"1586300567972425729\",\n" +
            "                            \"sort\": 3,\n" +
            "                            \"categoryName\": \"服务岗1\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369487530108399617\",\n" +
            "                    \"pid\": \"1369487530108399617\",\n" +
            "                    \"id\": \"1586264550863220738\",\n" +
            "                    \"sort\": 1,\n" +
            "                    \"categoryName\": \"前厅资料\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"children\": [],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1369487530108399617],\",\n" +
            "                            \"parentCategoryId\": \"1586285320284876801\",\n" +
            "                            \"pid\": \"1586285320284876801\",\n" +
            "                            \"id\": \"1586285719909773313\",\n" +
            "                            \"sort\": 1,\n" +
            "                            \"categoryName\": \"公共课程1\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"children\": [],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1369487530108399617],\",\n" +
            "                            \"parentCategoryId\": \"1586285320284876801\",\n" +
            "                            \"pid\": \"1586285320284876801\",\n" +
            "                            \"id\": \"1586301021749981185\",\n" +
            "                            \"sort\": 2,\n" +
            "                            \"categoryName\": \"烤鱼岗1\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369487530108399617\",\n" +
            "                    \"pid\": \"1369487530108399617\",\n" +
            "                    \"id\": \"1586285320284876801\",\n" +
            "                    \"sort\": 2,\n" +
            "                    \"categoryName\": \"后厨资料\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369487530108399617],\",\n" +
            "                    \"parentCategoryId\": \"1369487530108399617\",\n" +
            "                    \"pid\": \"1369487530108399617\",\n" +
            "                    \"id\": \"1586286648901971969\",\n" +
            "                    \"sort\": 3,\n" +
            "                    \"categoryName\": \"管理者资料\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369487530108399617\",\n" +
            "                    \"pid\": \"1369487530108399617\",\n" +
            "                    \"id\": \"1586286746323070978\",\n" +
            "                    \"sort\": 4,\n" +
            "                    \"categoryName\": \"食品安全1\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1371369119260127234\",\n" +
            "            \"categoryName\": \"外卖管理\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 2,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1369486826102861826\",\n" +
            "            \"categoryName\": \"配送管理\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 3,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369486826102861826\",\n" +
            "                    \"pid\": \"1369486826102861826\",\n" +
            "                    \"id\": \"1369539036740354050\",\n" +
            "                    \"sort\": 1,\n" +
            "                    \"categoryName\": \"供应链操作视频\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369486826102861826\",\n" +
            "                    \"pid\": \"1369486826102861826\",\n" +
            "                    \"id\": \"1397015180360114178\",\n" +
            "                    \"sort\": 2,\n" +
            "                    \"categoryName\": \"易耗品\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1369487028201205761\",\n" +
            "            \"categoryName\": \"人事管理\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 4,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1369486278255456258\",\n" +
            "            \"categoryName\": \"财务管理\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 5,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369486278255456258\",\n" +
            "                    \"pid\": \"1369486278255456258\",\n" +
            "                    \"id\": \"1597237566487330817\",\n" +
            "                    \"sort\": 1,\n" +
            "                    \"categoryName\": \"财务管理二级\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369486278255456258\",\n" +
            "                    \"pid\": \"1369486278255456258\",\n" +
            "                    \"id\": \"1597175294435983361\",\n" +
            "                    \"sort\": 1,\n" +
            "                    \"categoryName\": \"从网上\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369486278255456258\",\n" +
            "                    \"pid\": \"1369486278255456258\",\n" +
            "                    \"id\": \"1542031199990267905\",\n" +
            "                    \"sort\": 1,\n" +
            "                    \"categoryName\": \"20220629-测试分类\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369486278255456258\",\n" +
            "                    \"pid\": \"1369486278255456258\",\n" +
            "                    \"id\": \"1597242578470895617\",\n" +
            "                    \"sort\": 10,\n" +
            "                    \"categoryName\": \"财务管理二级-1\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1586262459293839361\",\n" +
            "            \"categoryName\": \"工程管理\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 6,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"children\": [\n" +
            "                                {\n" +
            "                                    \"children\": [],\n" +
            "                                    \"parentCategoryIds\": \"[0],[0],[1586262459293839361],[1586991073555591169],\",\n" +
            "                                    \"parentCategoryId\": \"1586991489588604930\",\n" +
            "                                    \"pid\": \"1586991489588604930\",\n" +
            "                                    \"id\": \"1586991764638478337\",\n" +
            "                                    \"sort\": 1,\n" +
            "                                    \"categoryName\": \"测试时杀杀杀\",\n" +
            "                                    \"levels\": 4,\n" +
            "                                    \"status\": 0\n" +
            "                                }\n" +
            "                            ],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1586262459293839361],\",\n" +
            "                            \"parentCategoryId\": \"1586991073555591169\",\n" +
            "                            \"pid\": \"1586991073555591169\",\n" +
            "                            \"id\": \"1586991489588604930\",\n" +
            "                            \"sort\": 10,\n" +
            "                            \"categoryName\": \"测试22\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1586262459293839361\",\n" +
            "                    \"pid\": \"1586262459293839361\",\n" +
            "                    \"id\": \"1586991073555591169\",\n" +
            "                    \"sort\": 0,\n" +
            "                    \"categoryName\": \"测试测试分类管理\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"children\": [],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1586262459293839361],\",\n" +
            "                            \"parentCategoryId\": \"1597235526440779778\",\n" +
            "                            \"pid\": \"1597235526440779778\",\n" +
            "                            \"id\": \"1597235721282977794\",\n" +
            "                            \"sort\": 2,\n" +
            "                            \"categoryName\": \"工程管理空空\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1586262459293839361\",\n" +
            "                    \"pid\": \"1586262459293839361\",\n" +
            "                    \"id\": \"1597235526440779778\",\n" +
            "                    \"sort\": 2,\n" +
            "                    \"categoryName\": \"工程管理空\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1586262459293839361\",\n" +
            "                    \"pid\": \"1586262459293839361\",\n" +
            "                    \"id\": \"1597234399792005122\",\n" +
            "                    \"sort\": 2,\n" +
            "                    \"categoryName\": \"工程管理测试子类\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1369486558170722306\",\n" +
            "            \"categoryName\": \"后厨资料5\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 10,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"children\": [\n" +
            "                        {\n" +
            "                            \"children\": [],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1369486558170722306],\",\n" +
            "                            \"parentCategoryId\": \"1574930856841515010\",\n" +
            "                            \"pid\": \"1574930856841515010\",\n" +
            "                            \"id\": \"1580094221720088578\",\n" +
            "                            \"sort\": 0,\n" +
            "                            \"categoryName\": \"米饭\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"children\": [],\n" +
            "                            \"parentCategoryIds\": \"[0],[0],[1369486558170722306],\",\n" +
            "                            \"parentCategoryId\": \"1574930856841515010\",\n" +
            "                            \"pid\": \"1574930856841515010\",\n" +
            "                            \"id\": \"1580094382357737473\",\n" +
            "                            \"sort\": 1,\n" +
            "                            \"categoryName\": \"豆浆\",\n" +
            "                            \"levels\": 3,\n" +
            "                            \"status\": 0\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369486558170722306\",\n" +
            "                    \"pid\": \"1369486558170722306\",\n" +
            "                    \"id\": \"1574930856841515010\",\n" +
            "                    \"sort\": 0,\n" +
            "                    \"categoryName\": \"专项标准\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369486558170722306],\",\n" +
            "                    \"parentCategoryId\": \"1369486558170722306\",\n" +
            "                    \"pid\": \"1369486558170722306\",\n" +
            "                    \"id\": \"1369543412842266626\",\n" +
            "                    \"sort\": 3,\n" +
            "                    \"categoryName\": \"烤鱼岗\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369486558170722306],\",\n" +
            "                    \"parentCategoryId\": \"1369486558170722306\",\n" +
            "                    \"pid\": \"1369486558170722306\",\n" +
            "                    \"id\": \"1369547761656037377\",\n" +
            "                    \"sort\": 4,\n" +
            "                    \"categoryName\": \"鱼锅岗\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369486558170722306],\",\n" +
            "                    \"parentCategoryId\": \"1369486558170722306\",\n" +
            "                    \"pid\": \"1369486558170722306\",\n" +
            "                    \"id\": \"1574929776166506498\",\n" +
            "                    \"sort\": 5,\n" +
            "                    \"categoryName\": \"涮菜、凉菜岗\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369486558170722306],\",\n" +
            "                    \"parentCategoryId\": \"1369486558170722306\",\n" +
            "                    \"pid\": \"1369486558170722306\",\n" +
            "                    \"id\": \"1369876783749496834\",\n" +
            "                    \"sort\": 5,\n" +
            "                    \"categoryName\": \"烧烤岗\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369486558170722306],\",\n" +
            "                    \"parentCategoryId\": \"1369486558170722306\",\n" +
            "                    \"pid\": \"1369486558170722306\",\n" +
            "                    \"id\": \"1369877189967839233\",\n" +
            "                    \"sort\": 8,\n" +
            "                    \"categoryName\": \"洗碗岗\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1369486942742261762\",\n" +
            "            \"categoryName\": \"前厅资料3\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 20,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369486942742261762],\",\n" +
            "                    \"parentCategoryId\": \"1369486942742261762\",\n" +
            "                    \"pid\": \"1369486942742261762\",\n" +
            "                    \"id\": \"1406847597463801858\",\n" +
            "                    \"sort\": 11,\n" +
            "                    \"categoryName\": \"迎宾岗\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369486942742261762],\",\n" +
            "                    \"parentCategoryId\": \"1369486942742261762\",\n" +
            "                    \"pid\": \"1369486942742261762\",\n" +
            "                    \"id\": \"1406847654627971074\",\n" +
            "                    \"sort\": 12,\n" +
            "                    \"categoryName\": \"服务岗\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369486942742261762],\",\n" +
            "                    \"parentCategoryId\": \"1369486942742261762\",\n" +
            "                    \"pid\": \"1369486942742261762\",\n" +
            "                    \"id\": \"1406847741424898050\",\n" +
            "                    \"sort\": 13,\n" +
            "                    \"categoryName\": \"传菜岗\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                },\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[1369486942742261762],\",\n" +
            "                    \"parentCategoryId\": \"1369486942742261762\",\n" +
            "                    \"pid\": \"1369486942742261762\",\n" +
            "                    \"id\": \"1406847792494743553\",\n" +
            "                    \"sort\": 14,\n" +
            "                    \"categoryName\": \"收银岗\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1369486608401707009\",\n" +
            "            \"categoryName\": \"营运分享\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 40,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [\n" +
            "                {\n" +
            "                    \"children\": [],\n" +
            "                    \"parentCategoryIds\": \"[0],[0],\",\n" +
            "                    \"parentCategoryId\": \"1369486608401707009\",\n" +
            "                    \"pid\": \"1369486608401707009\",\n" +
            "                    \"id\": \"1384743241281175553\",\n" +
            "                    \"sort\": 1,\n" +
            "                    \"categoryName\": \"舞蹈视频\",\n" +
            "                    \"levels\": 2,\n" +
            "                    \"status\": 0\n" +
            "                }\n" +
            "            ],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1369486681621671937\",\n" +
            "            \"categoryName\": \"培训管理\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 70,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": \"1369487688225271809\",\n" +
            "            \"categoryName\": \"设备\",\n" +
            "            \"categoryLogo\": null,\n" +
            "            \"parentCategoryId\": \"0\",\n" +
            "            \"parentCategoryIds\": \"[0],\",\n" +
            "            \"sort\": 100,\n" +
            "            \"status\": 0,\n" +
            "            \"children\": [],\n" +
            "            \"levels\": 1,\n" +
            "            \"description\": null,\n" +
            "            \"pid\": \"0\"\n" +
            "        }\n" +
            "    ]";


    @Test
    public void test() {
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            List<TrainCategoryResult> result = JSONArray.parseArray(json, TrainCategoryResult.class);
            // System.out.println(result.size());
        }
        long l2 = System.currentTimeMillis();

        System.out.println(l2 - l1);


        long l3 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            List<TrainCategoryResult> result = JSONArray.parseArray(json2, TrainCategoryResult.class);
            // System.out.println(result.size());
        }
        long l4 = System.currentTimeMillis();

        System.out.println(l4 - l3);
    }

    String json2 = "[{\"categoryName\":\"运营管理\",\"children\":[],\"id\":1369487530108399617,\"levels\":1,\"parentCategoryId\":0,\"parentCategoryIds\":\"[0],\",\"pid\":0,\"sort\":1,\"status\":0}," +
            "{\"categoryName\":\"线上营销\",\"children\":[],\"id\":1595964654535413761,\"levels\":1,\"parentCategoryId\":0,\"parentCategoryIds\":\"[0],\",\"pid\":0,\"sort\":2,\"status\":0},{\"categoryName\":\"外卖管理\",\"children\":[],\"id\":1371369119260127234,\"levels\":1,\"parentCategoryId\":0,\"parentCategoryIds\":\"[0],\",\"pid\":0,\"sort\":2,\"status\":0},{\"categoryName\":\"配送管理\",\"children\":[],\"id\":1369486826102861826,\"levels\":1,\"parentCategoryId\":0,\"parentCategoryIds\":\"[0],\",\"pid\":0,\"sort\":3,\"status\":0},{\"categoryName\":\"人事管理\",\"children\":[],\"id\":1369487028201205761,\"levels\":1,\"parentCategoryId\":0,\"parentCategoryIds\":\"[0],\",\"pid\":0,\"sort\":4,\"status\":0},{\"categoryName\":\"财务管理\",\"children\":[],\"id\":1369486278255456258,\"levels\":1,\"parentCategoryId\":0,\"parentCategoryIds\":\"[0],\",\"pid\":0,\"sort\":5,\"status\":0},{\"categoryName\":\"工程管理\",\"children\":[],\"id\":1586309031456333825,\"levels\":1,\"parentCategoryId\":0,\"parentCategoryIds\":\"[0],\",\"pid\":0,\"sort\":7,\"status\":0}]";


}
