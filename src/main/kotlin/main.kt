import crypto.createHash

fun main() {
    val hello = "world"
    val hash = computeSha1(hello)
    println("sha1($hello) = $hash")
}

private fun computeSha1(data: String) {
    createHash("sha1").run {
        update(data)
        digest("hex")
    }
}
