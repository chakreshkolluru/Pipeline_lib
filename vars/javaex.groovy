def call(String s){

	git "https://github.com/chakreshkolluru/chakresh.git"
	sh 'javac ${s}/Hello.java'

	sh 'java -cp ${s} Hello'
}