import { gql } from '@apollo/client'

const AUTHORS = gql`
  query {
    authors {
      id
      name
      books {
        title
      }
    }
  }
`

export default AUTHORS;
