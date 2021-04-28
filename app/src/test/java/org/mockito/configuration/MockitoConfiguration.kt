package org.mockito.configuration


class MockitoConfiguration : DefaultMockitoConfiguration() {

    override fun enableClassCache(): Boolean {
        return false
    }
}