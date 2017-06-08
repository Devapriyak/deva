Building block of a spock unit test case
1. Import statement
2. Specification extension
3. Fields
4. Fixtures
5. Feature method
6. blocks

Fixtures
def setup() // like @Before in Junit -> executes before each unit test case.
def cleanup() // like @After in Junit -> executes after each unit test case.
def setupSpec() // like @BeforeClass in Junit -> executes before each unit test case.
def cleanupSpec() // like @AfterClass in Junit -> executes after each unit test case.