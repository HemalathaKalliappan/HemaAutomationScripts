$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Projectcreation/Projectcreation.feature");
formatter.feature({
  "line": 1,
  "name": "Login and project creation functionality",
  "description": "I want to login the application",
  "id": "login-and-project-creation-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 64141495105,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Chrome failed to start: exited normally\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 62.12 seconds\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027HTSPC91\u0027, ip: \u0027192.168.22.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: driver.version: ChromeDriver\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$new$0(JsonWireProtocolResponse.java:53)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$getResponseFunction$2(JsonWireProtocolResponse.java:91)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:126)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:212)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:130)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat Stepdefinition.Ahfsteps.open_the_browser(Ahfsteps.java:71)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:539)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:761)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:461)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:207)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 5,
  "name": "verify login functionality",
  "description": "",
  "id": "login-and-project-creation-functionality;verify-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to the Url",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "Ahfsteps.open_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ahfsteps.navigate_to_the_Url()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ahfsteps.enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ahfsteps.validate_the_outcomes()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1369871,
  "error_message": "java.lang.NullPointerException\r\n\tat Stepdefinition.Ahfsteps.afterScenario(Ahfsteps.java:82)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.base/java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:539)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:761)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:461)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:207)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Acquisition project creation",
  "description": "",
  "id": "login-and-project-creation-functionality;acquisition-project-creation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Acquisition"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Navigate to the Url",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Click on Acquisition",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Enter all the required fields \"\u003cDealname\u003e\" and \"\u003cAHF Lead\u003e\" and \"\u003cBureau\u003e\" and \"\u003cProject Type\u003e\" and \"\u003cDeal Overview\u003e\"and \"\u003cPlaybook Stage\u003e\" and \"\u003c12-Month Census Impact\u003e\" and \"\u003cPriority\u003e\" and \"\u003cStatus\u003e\" and \"\u003cStatus Explanation\u003e\" and \"\u003cOther Comments\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on save",
  "keyword": "When "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "login-and-project-creation-functionality;acquisition-project-creation;",
  "rows": [
    {
      "cells": [
        "Dealname",
        "AHF Lead",
        "Bureau",
        "Project Type",
        "Deal Overview",
        "Playbook Stage",
        "12-Month Census Impact",
        "Closing Date",
        "Priority",
        "Status",
        "Status Explanation",
        "Other Comments"
      ],
      "line": 22,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;1"
    },
    {
      "cells": [
        "Acquistions Pro1",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 23,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;2"
    },
    {
      "cells": [
        "Acquistions Pro2",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 24,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;3"
    },
    {
      "cells": [
        "Acquistions Pro3",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 25,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;4"
    },
    {
      "cells": [
        "Acquistions Pro4",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 26,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;5"
    },
    {
      "cells": [
        "Acquistions Pro5",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 27,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;6"
    },
    {
      "cells": [
        "Acquistions Pro6",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 28,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;7"
    },
    {
      "cells": [
        "Acquistions Pro7",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 29,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;8"
    },
    {
      "cells": [
        "Acquistions Pro8",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 30,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;9"
    },
    {
      "cells": [
        "Acquistions Pro9",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 31,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;10"
    },
    {
      "cells": [
        "Acquistions Pro10",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 32,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;11"
    },
    {
      "cells": [
        "Acquistions Pro11",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 33,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;12"
    },
    {
      "cells": [
        "Acquistions Pro12",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 34,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;13"
    },
    {
      "cells": [
        "Acquistions Pro13",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 35,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;14"
    },
    {
      "cells": [
        "Acquistions Pro14",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 36,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;15"
    },
    {
      "cells": [
        "Acquistions Pro15",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 37,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;16"
    },
    {
      "cells": [
        "Acquistions Pro16",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 38,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;17"
    },
    {
      "cells": [
        "Acquistions Pro17",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 39,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;18"
    },
    {
      "cells": [
        "Acquistions Pro18",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 40,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;19"
    },
    {
      "cells": [
        "Acquistions Pro19",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 41,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;20"
    },
    {
      "cells": [
        "Acquistions Pro20",
        "Asif Iqbal",
        "Northern",
        "Pharmacy",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
        "Prospecting",
        "\u003c250",
        "",
        "High",
        "Open",
        "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
        "As members of the inaugural AIDS Hospice Committee"
      ],
      "line": 42,
      "id": "login-and-project-creation-functionality;acquisition-project-creation;;21"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2920331656,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Acquisition project creation",
  "description": "",
  "id": "login-and-project-creation-functionality;acquisition-project-creation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Acquisition"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Navigate to the Url",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Click on Acquisition",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Enter all the required fields \"Acquistions Pro1\" and \"Asif Iqbal\" and \"Northern\" and \"Pharmacy\" and \"AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients\"and \"Prospecting\" and \"\u003c250\" and \"High\" and \"Open\" and \"AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit\" and \"As members of the inaugural AIDS Hospice Committee\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    8,
    9,
    10,
    11
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on save",
  "keyword": "When "
});
formatter.match({
  "location": "Ahfsteps.open_the_browser()"
});
formatter.result({
  "duration": 3214515399,
  "status": "passed"
});
formatter.match({
  "location": "Ahfsteps.navigate_to_the_Url()"
});
formatter.result({
  "duration": 5083502710,
  "status": "passed"
});
formatter.match({
  "location": "Ahfsteps.enter_username_and_password()"
});
formatter.result({
  "duration": 23933100257,
  "status": "passed"
});
formatter.match({
  "location": "Ahfsteps.click_on_Acquisition()"
});
formatter.result({
  "duration": 10025352525,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027HTSPC91\u0027, ip: \u0027192.168.22.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\KHEMAL~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: e1cb75df038871718596dc964467f911\n*** Element info: {Using\u003dcss selector, value\u003da[href*\u003d\u0027https://ahf365.sharepoint.com/sites/AHFUAT/Acquisition/SitePages/ProjectCreate.aspx\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat AHFWebApp.pro.Acquisition.Acquisitionlink1(Acquisition.java:77)\r\n\tat Stepdefinition.Ahfsteps.click_on_Acquisition(Ahfsteps.java:140)\r\n\tat ✽.When Click on Acquisition(src/test/resources/Projectcreation/Projectcreation.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Acquistions Pro1",
      "offset": 31
    },
    {
      "val": "Asif Iqbal",
      "offset": 54
    },
    {
      "val": "Northern",
      "offset": 71
    },
    {
      "val": "Pharmacy",
      "offset": 86
    },
    {
      "val": "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients",
      "offset": 101
    },
    {
      "val": "Prospecting",
      "offset": 204
    },
    {
      "val": "\u003c250",
      "offset": 222
    },
    {
      "val": "High",
      "offset": 233
    },
    {
      "val": "Open",
      "offset": 244
    },
    {
      "val": "AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit",
      "offset": 255
    },
    {
      "val": "As members of the inaugural AIDS Hospice Committee",
      "offset": 334
    }
  ],
  "location": "Ahfsteps.enter_all_the_required_fields_and_and_and_and_and_and_and_and_and_and(String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Ahfsteps.click_on_save()"
});
formatter.result({
  "status": "skipped"
});
