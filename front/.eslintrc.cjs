module.exports = {
	'env': {
		'browser': true,
		'es2021': true
	},
	'extends': [
    'prettier',
		'eslint:recommended',
		'plugin:@typescript-eslint/recommended'
	],
	'overrides': [
	],
	'parser': '@typescript-eslint/parser',
	'parserOptions': {
		'ecmaVersion': 'latest',
		'sourceType': 'module'
	},
	'plugins': [
    'prettier',
		'react',
		'@typescript-eslint'
	],
	'rules': {
    "no-console": ['error'],
    'prettier/prettier': ['error']
	}
};
